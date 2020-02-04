package com.app.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
@NoArgsConstructor
@RequiredArgsConstructor
public class LombokTest {
private Integer eid;
private String ename;
}

In This Condition It Will Give Error Because Two Methods Is Generated With Same Name Method Is 
Nothing But Default Constructor

  Because @RequiredArgsConstructor Is First Search For @NonNull Annotation If Found Then It Will Generate 
  Parameterized Constructor or else it will generate Default Constructor
  Hence In This Condition Both Annotations Are Same
*/


/*
@NoArgsConstructor
@RequiredArgsConstructor
public class LombokTest{
	@NonNull
private Integer eid;
private String ename;
	
}

In This Situation Lombok WIll Generate One Default COnstructor And One Parameterized Constructor
*/


/*
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LombokTest{
	private Integer eid;
	private String ename;
}

* In This Situation It Will Generate One Default Constructor And One Two Param Constructor
*/

/*
@NoArgsConstructor
@AllArgsConstructor
public class LombokTest{	

}

In This Situation It WIll Generate error Because Two Default Constructor Is Generated With Same Name
*/



/*
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class LombokTest{	
	

}

In This Situation It WIll Generate error Because Three Default Constructor Is Generated With Same Name
*/

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LombokTest{
	private Integer eid;
	private String ename;
}