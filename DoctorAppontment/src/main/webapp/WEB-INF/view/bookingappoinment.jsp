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
    <title>Booking Appoinment</title>
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

        .form-group{
            width: 100%;
        }
        .form-group tr td input{
            border: none;
            border-radius: 0;
            background-color: rgba(0,0,0,0.3);
        }
        .custom-select{
            border: none;
            border-radius: 0;
            background-color: rgba(0,0,0,0.3);
        }
        #dpicker{
            width: 100%;
            height: 35px;
        }
        #sbmit{
            width: 50%;
            float: right;
            height: 35px;
            margin: 5px 0px;
        }
        #sbmit:hover{
            background-color: rgba(0,0,0,0.7);
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


            <div class="container bg-primary rounded mt-1">
                <div class="row">
                    <div class="col-12">
                        <div id="btns">
                            <ul>
                                <li><a href="">My Details</a></li>
                                <li><a href="transtomyde">Book Appoinment</a></li>
                                <li><a href="bookingh">View Booking</a></li>
                                <li><a href="">Cancle Booking</a></li>
                                <li><a href="">Search Doctor</a></li>
                                <li><a href="">Feedback</a></li>
                                <li><a href="">Logout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>


            <div class="rounded mt-1" id="baby2">
                <div class="container">
                    <div class="row">
                        <div class="col-3"></div>
                        <div class="col-6 mt-3">
                            <h3 class="text-center">Booking Appoinment</h3>

                            <form action="savebookingn" method="post" id="from">
                                <table class="form-group">

                                    <tr><td>Patient Name <input type="text" class="form-control" name="p_name" required></td></tr>
                                    <tr><td>Doctor Name <input type="text" class="form-control" name="d_name" required></td></tr>
                                    <tr><td>Select Category
                                        <select class="custom-select" name="categoris" required>
                                            <option value="Medicine">Medicine</option>
                                            <option value="Cardiologist" >Cardiologist</option>
                                            <option value="Three" >Three</option>
                                            <option value="Three" >Three</option>
                                            <option value="Three">Three</option>
                                            <option value="Three">Three</option>
                                        </select>
                                    </td></tr>
                                    <tr><td>Select Date<input type="date" name="date" id="dpicker" required></td></tr>
                                    <tr><td>Select Time<input type="time" name="time" id="dpicker" required></td></tr>
                                    <tr><td><input type="submit" name="submit" value="Submit" id="sbmit"></td></tr>
                                </table>
                            </form>

                        </div>
                        <div class="col-3"></div>
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