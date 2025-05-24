package collections.list_ex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;

import dateCalculate.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ExceptionAndExclusion {
	 /*
			  Exclusion 					Exception
		------------				--------------
		1. 100						0
		2. Adding to Exception
			90						10 
		
		Payload :  if Exception StartDate is Past
		List<Exception> newlyMappedException = [10]
		List<Exclusion> newlyMappedExclusion = []
		
		--> Exception Insert Into Table
		--> If Exception is Not Empty and Exclusion is Empty
			Exception NDC is deleted from Exclusion
		
		Payload :  if Exception StartDate is Future
		List<Exception> newlyMappedException = [10]
		List<Exclusion> newlyMappedExclusion = [10] with start and End Date with Id
		
		--> Exception Insert into table 
		--> If Id present Update or Insert
		
		3. Removing From Exception
			92 						8
		
		Payload : 
		List<Exception> newlyMappedException = []
		List<Exclusion> newlyMappedExclusion = [2]
		
		--> Exclusion Insert / Update Into Table
		--> If Exception is Empty and Exclusion is Not Empty
			Exclusion NDC is deleted from Exception
		
		4. Removing From Exception
			92 	-4/+2 = 90					8 +4/-2 = 10
		
		Payload : 
		List<Exception> newlyMappedException = [4]
		List<Exclusion> newlyMappedExclusion = [2]
		
		--> Exception Insert Into Table  
			isNdcRemovedExclusion = true -- if start date is past or current
			Removing NDC from Exception or else No
		--> Exclusion Isert or Update
	  */
	public static void main(String[] args) {
		
		List<ExceptionNdc> newlyMappedException = new ArrayList<>();
		List<ExclusionNdc> newlyMappedExclusion = new ArrayList<>();

		List<ExceptionNdc> removedException = new ArrayList<>();
		List<ExclusionNdc> removedExclusion = new ArrayList<>();
		
		//Scenario - 1
		newlyMappedException.add(new ExceptionNdc(0L, "123", "05/23/2025", "",true));
		newlyMappedException.add(new ExceptionNdc(0L, "456", "05/23/2025", "",true));
		
		List<String> removedExclusionNdcList = newlyMappedException.stream()
//				.filter(obj -> obj.isRemovedInExclusion())
				.filter(obj -> DateUtil.stringToDate(obj.getStartDate(), "MM/dd/yyyy").isBefore(LocalDate.now()))
				.map(ExceptionNdc::getNdc)
			    .collect(Collectors.toList());
		
		if(ObjectUtils.isNotEmpty(removedExclusionNdcList)) {
			//Remove those NDCs in Exclusions
			System.out.println(removedExclusionNdcList);
		}
		
		// Insert newlyMappedException insert into table
		
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ExclusionNdc {
	private Long exclusionId;
	private String ndc;
	private String startDate;
	private String endDate;
	private boolean isRemovedInException;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ExceptionNdc {
	private Long exceptionId;
	private String ndc;
	private String startDate;
	private String endDate;
	private boolean isRemovedInExclusion;
	
}
