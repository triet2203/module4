<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>

<h2>USD to VND Converter</h2>

<form action="convert" method="post">

    <label>USD:</label>
    <input type="number" name="usd" step="0.01" required>

    <br><br>

    <label>Rate:</label>
    <input type="number" name="rate" step="0.01" value="26000" required>

    <br><br>

    <button type="submit">
        Convert
    </button>

</form>

</body>
</html>