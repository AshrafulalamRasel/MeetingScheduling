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
    <title>Home</title>
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

        .btn{
            background: red;
            width: 130px;
            height: 130px;
            border: 10px solid #009688;
        }
        #btn1{
            line-height: 6;
            font-size: 17px;
        }
        #btn1:hover{
            color: none;
            background: green;
            transition: 0.9s;
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
            <div class="rounded mt-2" id="baby2">
                <h3 class="text-center text-warning">Choose Your Login</h3>
                <div class="container mt-5">
                    <div class="row mt-5">
                        <div class="col-3"></div>
                        <div class="col-3">
                            <div>
                                <a href="" id="btn1" class="btn rounded-circle border-outline text-center">Admin Login</a>
                            </div>
                        </div>
                        <div class="col-3">
                            <div>
                                <a href="paitenin" id="btn1" class="btn rounded-circle text-center">Patient Login</a></div>
                        </div>
                        <div class="col-3">
                            <div>
                                <a href="" id="btn1" class="btn rounded-circle text-center">Doctor Login</a></div>
                        </div>
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