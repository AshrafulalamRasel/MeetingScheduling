<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <link rel="stylesheet" href="text/css">
    <title>Patien Profile Update</title>

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("form").submit(function () {
                alert("Successfully Update!!");

            });

        });
    </script>
    <style>
        body{
            background: url('IMAGE2.jpg');
            background-size: cover;
            background-repeat: no-repeat;
        }
        #main{
            background-color: rgb(0,0,0,0.3);
        }
        #text{
            color: white;
            border: none;
            border-radius: 0px;
            background-color: rgba(0,0,0,0.3);
        }
        .btn{
            width: 100%;
        }
        #icon{
            margin: -150px 0px;
        }
    </style>
<body>
<div class="container">
    <div class="row mt-5">
        <div class="col-4"></div>
        <div id="main" class="col-4 rounded text-light py-3 mt-5">
            <div class="text-center pb-5">
                <img src="png.png" style="width: 150px; height: 150px;" id="icon">
            </div>
            <h1 class="lead text-center pt-3">Patient Update</h1>
            <table class="input-group">
                <form class="form-horizontal" method="POST" action="patient_update">
                    <input type="hidden" name="id" value="${book.id }"  />
                    <span class="text-warning">Patient Name</span>
                    <input type="text" class="form-control" name="patname"  value="${book.patname}"required id="text">
                    <span class="text-warning">Doctor Name</span>
                    <input type="text" class="form-control" name="doctname" value="${book.doctname}" required id="text">
                    <span class="text-warning">Doctor Category</span>
                    <input type="text" class="form-control"  name="categoris" value="${book.categoris}" required  id="text">

                    <span class="text-warning">Date</span>
                    <input type="date" class="form-control" name="date" value="${book.date}" required  id="text">

                    <span class="text-warning">TIme</span>
                    <input type="time" class="form-control" name="time" value="${book.time}" required  id="text">

                    <input type="submit" name="submit" value="Update" class="btn btn-primary mt-2">

                </form>
            </table>
        </div>
        <div class="col-4"></div>
    </div>
</div>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="JS/bootstrap.min.js"></script>
</body>
</html>