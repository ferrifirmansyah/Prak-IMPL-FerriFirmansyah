class Employee{
    ...
        int payAmount () {
            switch (getType ()) {
                case EmployeeType.ENGINEER:
                    return _monthlysalary;
                case EmployeeType.SALESMAN:
                    return _monthlysalary + _commission;
                case EmployeeType.MANAGER:
                    return _monthlysalary + _bonus;
                default:
                    throw new Exception("Incorrect Employee") ;
            }
        }
}


