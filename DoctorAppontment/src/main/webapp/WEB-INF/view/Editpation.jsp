<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
    <title>Department of SWE</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body class="bg-success">
<div class="container text-center">
    <h3>Update patient</h3>
    <hr>
    <form class="form-horizontal" method="POST" action="patient_update">
        <input type="hidden" name="id" value="${book.id }"  />
        <div class="form-group">
            <label class="control-label col-md-3">Patient_Name</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="p_name"
                       value="${book.p_name }" required />
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Doctor_Name</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="d_name"
                       value="${book.d_name }" required />
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Doctor_Category</label>
            <div class="col-md-7">
                <input type="text" class="form-control" name="categoris"
                       value="${book.categoris }" required />
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Date</label>
            <div class="col-md-3">
                <input type="date" class="form-control" name="date"
                       value="${book.date }" required/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-md-3">Time</label>
            <div class="col-md-7">
                <input type="time" class="form-control" name="time"
                       value="${book.time }" required />
            </div>
        </div>
        <div class="form-group mt-2">
            <table>
                <tr>
                    <td><input type="submit" class="btn btn-primary" value="Update" />
                        <a class="links pl-2" href="updat">Show Your Updates</a></td>
                </tr>
            </table>
        </div>
    </form>
</div>

<script src="static/js/jquery-1.11.1.min.js"></script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="JS/bootstrap.min.js"></script>
</body>
</html>
