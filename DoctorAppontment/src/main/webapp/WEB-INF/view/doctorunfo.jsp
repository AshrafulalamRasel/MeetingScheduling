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
            background-color: rgba(0,0,0,0.7);
        }
        thead td{
            font-weight: bold;
        }
        #ddetail{
            background-color: rgba(0,0,0,0.8);
            border-radius: 5px;
            padding: 10px 25px;
        }
        #sbtn{
            border-radius: 25px;
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
                <div class="row">
                    <div class="col-4"></div>
                    <div class="col-4 text-center">
                        <a href="yourprofile"><button type="button" class="btn btn-danger px-5" id="sbtn">Search Doctor Using by regi_id_N:</button></a>
                    </div>
                    <div class="col-4"></div>
                </div>
            </div>
        </div>
        <div class="col-1"></div>
    </div>






                <div class="row">
                    <div class="col-1"></div>
                    <div class="col-10 text-center mt-3"><h2 class="text-center text-danger" id="ddetail">Doctor's Details</h2></div>
                    <div class="col-1"></div>
                </div>

                <div style="height: 400px;overflow-y: auto;">
                            <div class="table-responsive-sm" id="table">
                                <table class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Doctor_Reg:</th>
                                        <th>Doctor_Name</th>
                                        <th>Doctor_Password</th>
                                        <th>Doctor_Category</th>
                                        <th>Visit_patient_Date</th>
                                        <th>Starting_Time</th>
                                        <th>Ending_Time</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="doctor" items="${addm }">
                                        <tr>
                                            <td>${doctor.id}</td>
                                            <td>${doctor.doctorname}</td>
                                            <td>${doctor.doctorpass}</td>
                                            <td>${doctor.doctorcategori}</td>
                                            <td>${doctor.selectdate}</td>
                                            <td>${doctor.startingtime}</td>
                                            <td>${doctor.endingtime}</td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                </div>
</div>







<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="JS/bootstrap.min.js"></script>
</body>
</html>