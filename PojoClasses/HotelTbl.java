package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hotel_tbl database table.
 * 
 */
@Entity
@Table(name="hotel_tbl")
@NamedQuery(name="HotelTbl.findAll", query="SELECT h FROM HotelTbl h")
public class HotelTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hotel_id")
	private int hotelId;

	@Column(name="hotel_city")
	private String hotelCity;

	@Column(name="hotel_contact_number")
	private String hotelContactNumber;

	@Column(name="hotel_contact_person")
	private String hotelContactPerson;

	@Column(name="hotel_district")
	private String hotelDistrict;

	@Column(name="hotel_email")
	private String hotelEmail;

	private String hotel_isParking;

	@Column(name="hotel_name")
	private String hotelName;

	@Column(name="hotel_password")
	private String hotelPassword;

	@Column(name="hotel_pincode")
	private int hotelPincode;

	@Column(name="hotel_state")
	private String hotelState;

	@Column(name="hotel_uname")
	private String hotelUname;

	//bi-directional many-to-one association to BookingTbl
	@OneToMany(mappedBy="hotelTbl")
	private List<BookingTbl> bookingTbls;

	//bi-directional many-to-one association to ConferenceRoomTbl
	@OneToMany(mappedBy="hotelTbl")
	private List<ConferenceRoomTbl> conferenceRoomTbls;

	//bi-directional many-to-one association to ImageTbl
	@OneToMany(mappedBy="hotelTbl")
	private List<ImageTbl> imageTbls;

	public HotelTbl() {
	}

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelCity() {
		return this.hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelContactNumber() {
		return this.hotelContactNumber;
	}

	public void setHotelContactNumber(String hotelContactNumber) {
		this.hotelContactNumber = hotelContactNumber;
	}

	public String getHotelContactPerson() {
		return this.hotelContactPerson;
	}

	public void setHotelContactPerson(String hotelContactPerson) {
		this.hotelContactPerson = hotelContactPerson;
	}

	public String getHotelDistrict() {
		return this.hotelDistrict;
	}

	public void setHotelDistrict(String hotelDistrict) {
		this.hotelDistrict = hotelDistrict;
	}

	public String getHotelEmail() {
		return this.hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}

	public String getHotel_isParking() {
		return this.hotel_isParking;
	}

	public void setHotel_isParking(String hotel_isParking) {
		this.hotel_isParking = hotel_isParking;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelPassword() {
		return this.hotelPassword;
	}

	public void setHotelPassword(String hotelPassword) {
		this.hotelPassword = hotelPassword;
	}

	public int getHotelPincode() {
		return this.hotelPincode;
	}

	public void setHotelPincode(int hotelPincode) {
		this.hotelPincode = hotelPincode;
	}

	public String getHotelState() {
		return this.hotelState;
	}

	public void setHotelState(String hotelState) {
		this.hotelState = hotelState;
	}

	public String getHotelUname() {
		return this.hotelUname;
	}

	public void setHotelUname(String hotelUname) {
		this.hotelUname = hotelUname;
	}

	public List<BookingTbl> getBookingTbls() {
		return this.bookingTbls;
	}

	public void setBookingTbls(List<BookingTbl> bookingTbls) {
		this.bookingTbls = bookingTbls;
	}

	public BookingTbl addBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().add(bookingTbl);
		bookingTbl.setHotelTbl(this);

		return bookingTbl;
	}

	public BookingTbl removeBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().remove(bookingTbl);
		bookingTbl.setHotelTbl(null);

		return bookingTbl;
	}

	public List<ConferenceRoomTbl> getConferenceRoomTbls() {
		return this.conferenceRoomTbls;
	}

	public void setConferenceRoomTbls(List<ConferenceRoomTbl> conferenceRoomTbls) {
		this.conferenceRoomTbls = conferenceRoomTbls;
	}

	public ConferenceRoomTbl addConferenceRoomTbl(ConferenceRoomTbl conferenceRoomTbl) {
		getConferenceRoomTbls().add(conferenceRoomTbl);
		conferenceRoomTbl.setHotelTbl(this);

		return conferenceRoomTbl;
	}

	public ConferenceRoomTbl removeConferenceRoomTbl(ConferenceRoomTbl conferenceRoomTbl) {
		getConferenceRoomTbls().remove(conferenceRoomTbl);
		conferenceRoomTbl.setHotelTbl(null);

		return conferenceRoomTbl;
	}

	public List<ImageTbl> getImageTbls() {
		return this.imageTbls;
	}

	public void setImageTbls(List<ImageTbl> imageTbls) {
		this.imageTbls = imageTbls;
	}

	public ImageTbl addImageTbl(ImageTbl imageTbl) {
		getImageTbls().add(imageTbl);
		imageTbl.setHotelTbl(this);

		return imageTbl;
	}

	public ImageTbl removeImageTbl(ImageTbl imageTbl) {
		getImageTbls().remove(imageTbl);
		imageTbl.setHotelTbl(null);

		return imageTbl;
	}

}