<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Patien Profile</title>
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


    </style>
<body>
<div class="container">
    <div class="row">
        <div class="col-1"></div>
        <div class="col-10">
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
                                <li><a href="booki">Book Appoinment</a></li>
                                <li><a href="viewbook">View Booking</a></li>
                                <li><a href="canclebook">Cancle Booking</a></li>
                                <li><a href="Serachbook">Search Doctor</a></li>
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
                        <div class="col-1"></div>
                        <div class="col-10 text-center mt-3">
                            <h2 class="text-center">Details</h2>

                            <div class="table-responsive-md" id="table">
                                <table class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Patient_Id</th>
                                        <th>Patient_Name</th>
                                        <th>Doctor_Name</th>
                                        <th>Doctor_Category</th>
                                        <th>Time</th>
                                        <th>Date</th>
                                        <th>Edit</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="book" items="${books}">
                                        <tr>
                                            <td>${book.id}</td>
                                            <td>${book.p_name}</td>
                                            <td>${book.d_name}</td>
                                            <td>${book.categoris}</td>
                                            <td>${book.date}</td>
                                            <td>${book.time}</td>
                                            <td><a href="/edit-patient?id=${book.id}"><span>
                                     <i class="fa fa-edit"></i></span></a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="col-1"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-1"></div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="JS/bootstrap.min.js"></script>
</body>
</html>