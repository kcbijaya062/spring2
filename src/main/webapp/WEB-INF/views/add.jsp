<!DOCTYPE html>
<html lang="en">
<head>
    <title>Addition Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class ="container">
<h2>Addition form</h2>
<form action ="doadd">

    <div class ="form-group">
        <label>no1:</label>
        <input type="number" class="form-control" name="number1">
    </div>
    <div class="form-group">
    <label>no2:</label>
    <input type ="number" class=" form-control" name="number2">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<div> Sum is == ${sum}</div>
</div>