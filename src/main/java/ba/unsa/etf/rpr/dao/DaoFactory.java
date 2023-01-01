package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.*;
import ba.unsa.etf.rpr.exceptions.FlightsException;

public class DaoFactory {
    private static final FlightsDAO flight = new FlightsDaoImplementation();
    private static final DepartureDAO departure = new DepartureDaoImplementation();
    private static final ArrivalDAO arrival = new ArrivalDaoImplementation();
    private static final PersonsDAO person = new PersonsDaoImplementation();
    private static final EmployeesDAO employee = new EmployeesDaoImplementation();

    public DaoFactory() {
    }

    public static FlightsDAO flightsDao(){ return flight;}
    public static DepartureDAO departureDao(){ return departure;}
    public static ArrivalDAO arrivalDao(){ return arrival;}
    public static PersonsDAO personsDao(){ return person;}
    public static EmployeesDAO employeesDao(){ return employee;}
}
