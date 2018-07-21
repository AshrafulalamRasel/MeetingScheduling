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
    <title>Registration</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("form").submit(function () {
                alert("Successfully Registation!!");

            });

        });
    </script>
    <style>
        body{
            background: url('back.jpg');
            background-size: cover;
            background-repeat: no-repeat;
        }
        #baby{
            background: url('back22.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            min-height: 300px;
        }
        #baby2{
            background: url('back1.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            min-height: 300px;
        }
        #btns ul{
            margin: 0px -13px;
            padding: 0;
        }
        #btns ul li{
            float: left;
            list-style: none;
        }
        #btns ul li a{
            color: white;
            padding: 0px 7px;
        }
        #btns ul li a:hover{
            text-decoration: none;
            background: #2563c6;
        }
        #table{
            color: white;
            background-color: rgba(0,0,0,0.4);
        }
        thead td{
            font-weight: bold;
        }
        #fg{
            color: white;
            border: none;
            border-radius: 0;
            background-color: rgba(0,0,0,0.5);
        }
        #fg1{
            width: 50%;
            float: right;
            color: white;
            border: none;
            border-radius: 0;
            background-color: rgba(0,0,0,0.5);
        }
        #from{
            float: right;
        }

    </style>
<body>
<div class="container">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8">
            <div id="baby" class="rounded mt-2">
                <i class="fas fa-plus-square text-danger"style="font-size: 50px;float: right;margin: 20px 240px;"></i>
                <h3 id="h1" class="text-left text-danger pl-3 py-5">DOCTOR BOOKING APPOINMENT SYSTEM</h3>
            </div>

            <div class="rounded mt-1" id="baby2">
                <div class="container">
                    <div class="row">
                        <div class="col-2"></div>
                        <div class="col-8 mt-3">
                            <h3 class="text-center">Registration Form</h3>

                            <form action="user_registation" method="post" id="from">
                                <table class="form-group">
                                    <tr><td>Patient_Name:<input type="text" name="username" class="form-control" id="fg" required></td></tr>
                                    <tr><td>Patient_Address <input type="text" name="address" class="form-control" id="fg" required></td></tr>
                                    <tr><td>Patient_Age <input type="text" name="age" class="form-control" id="fg"required></td></tr>
                                    <tr><td>Patient_PhoneNumber <input type="text" name="mobleNumber" class="form-control" id="fg"required></td></tr>
                                    <tr><td>Password <input type="password" name="password" class="form-control" id="fg"required></td></tr>
                                    <tr><td><input type="submit" name="Submit"  class="form-control mt-1" value="Submit" id="fg1"></td></tr>
                                </table>
                            </form>
                        </div>
                        <div class="col-2"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-2"></div>
    </div>
</div>






<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>


<script src="JS/bootstrap.min.js"></script>
</body>
</html>