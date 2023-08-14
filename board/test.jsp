<%@ page contentType="text/html;charset=utf-8"%>
<%! 
	//여기는 멤버영역임
	int age=5;

	public void test(int age){
		this.age=age;
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">

<title>Document</title>
</head>
<body>
	나의 웹 어플리케이션 생성 성공~!
	<%
		out.print("test");
	%>
</body>
</html>