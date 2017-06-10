<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TaxPayer Information Form</title>
</head>
<body bgcolor="ffffe6"><center>
<form action="Tax" method="post">
<br></br>
<h1><font color="grey">THIS IS GOVERNMENT RECORD</font><br><br>
        <span>Enter The Details</span>
    </h1>
    
        <br>Name :<br>
        <input type="text" name="name"  placeholder="Your Name" />
    
   <br>
    
     
        Age :<br>
        <input type="text" name="age" placeholder="Age" />
    <br>
    
    
       <br> Phone number :<br>
        <input type="text" align="left" name="phone" placeholder="Phone number" />
    <br>
    
    
        <br>Your Email :<br>
        <input align="left" type="email" name="email" placeholder="Email Address" />
    <br>
    
    
        <br>Address :<br>
        <textarea name="address" placeholder=" Enter your address" ></textarea>
    
      <br> 
        
    
       <br> Gender :<select name="gender">
        <option value="Female">Female</option>
        <option value="Male">Male</option>
        <option value="others">Others</option>
        
        </select>
    
    <br>
     
        <br>Your income:<br>
        <input type="text" name="income" placeholder="Income" />
    
    </br>
     
        <br>Your tax amount :<br>
        <input type="text" name="amount" placeholder="Tax to be paid" />
    
    </br>
     
        <br>Enter ID :<br>
        <input  type="text" name="id" placeholder="Unique ID" />
    </br>
    
    
       <br>
     <label>
      <span>&nbsp;</span>
        <input type="submit" class="button" value="Send" /> 
    </label>    
</form></center>
</body>
</html>