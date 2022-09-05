import java.util.*;
import java.text.*;
import java.io.*;


public class HallBooking {
    private Hall hall;
    private Event event;
    private Date eventDate;
    private Double price;
    
    HallBooking(){}
    
    HallBooking(Hall hall,Event event,Date date,Double price){
        this.hall = hall;
        this.event = event;
        this.eventDate = date;
        this.price = price;
    }
    
    public void setHall(Hall hall){
        this.hall = hall;
    }
    public void setEvent(Event event){
        this.event = event;
    }
    public void setEventDate(Date eventDate){
        this.eventDate = eventDate;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Hall getHall(){
        return this.hall;
    }
    public Event getEvent(){
        return this.event;
    }
    public Date getEventDate(){
        return this.eventDate;
    }
    public Double getPrice(){
        return this.price;
    }
    
    //fill your code here
    @Override
    public String toString(){
    	return "HallNotAvailableException: ";
	}
}