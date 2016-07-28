<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>taks3</title>
</head>
<body>
<form action="/questionnaire" method="POST">

    Name:<input type="text" name="name"/>
    <br/>Surname:<input type="text" name="surname"/>
    <br/>Age:<input type="text" name="age"/>

    <br>Question 1?
    <br/><input type="radio" name="question1" value="yes"/> Yes
    <br/><input type="radio" name="question1" value="no"/> No

    <br/>Question 2?
    <br/><input type="radio" name="question2" value="yes"/> Yes
    <br/><input type="radio" name="question2" value="no"/> No
    <br/><input type="submit">

</form>
</body>
</html>
