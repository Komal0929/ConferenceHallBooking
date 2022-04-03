package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the conference_room_tbl database table.
 * 
 */
@Entity
@Table(name="conference_room_tbl")
@NamedQuery(name="ConferenceRoomTbl.findAll", query="SELECT c FROM ConferenceRoomTbl c")
public class ConferenceRoomTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="confroom_id")
	private int confroomId;

	@Column(name="confroom_capacity")
	private int confroomCapacity;

	private String confroom_isAC;

	private String confroom_isDining;

	private String confroom_isProjector_facility;

	private String confroom_isSmoking;

	@Column(name="confroom_name")
	private String confroomName;

	//bi-directional many-to-one association to BookingTbl
	@OneToMany(mappedBy="conferenceRoomTbl")
	private List<BookingTbl> bookingTbls;

	//bi-directional many-to-one association to HotelTbl
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private HotelTbl hotelTbl;

	//bi-directional many-to-one association to ImageTbl
	@OneToMany(mappedBy="conferenceRoomTbl")
	private List<ImageTbl> imageTbls;

	public ConferenceRoomTbl() {
	}

	public int getConfroomId() {
		return this.confroomId;
	}

	public void setConfroomId(int confroomId) {
		this.confroomId = confroomId;
	}

	public int getConfroomCapacity() {
		return this.confroomCapacity;
	}

	public void setConfroomCapacity(int confroomCapacity) {
		this.confroomCapacity = confroomCapacity;
	}

	public String getConfroom_isAC() {
		return this.confroom_isAC;
	}

	public void setConfroom_isAC(String confroom_isAC) {
		this.confroom_isAC = confroom_isAC;
	}

	public String getConfroom_isDining() {
		return this.confroom_isDining;
	}

	public void setConfroom_isDining(String confroom_isDining) {
		this.confroom_isDining = confroom_isDining;
	}

	public String getConfroom_isProjector_facility() {
		return this.confroom_isProjector_facility;
	}

	public void setConfroom_isProjector_facility(String confroom_isProjector_facility) {
		this.confroom_isProjector_facility = confroom_isProjector_facility;
	}

	public String getConfroom_isSmoking() {
		return this.confroom_isSmoking;
	}

	public void setConfroom_isSmoking(String confroom_isSmoking) {
		this.confroom_isSmoking = confroom_isSmoking;
	}

	public String getConfroomName() {
		return this.confroomName;
	}

	public void setConfroomName(String confroomName) {
		this.confroomName = confroomName;
	}

	public List<BookingTbl> getBookingTbls() {
		return this.bookingTbls;
	}

	public void setBookingTbls(List<BookingTbl> bookingTbls) {
		this.bookingTbls = bookingTbls;
	}

	public BookingTbl addBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().add(bookingTbl);
		bookingTbl.setConferenceRoomTbl(this);

		return bookingTbl;
	}

	public BookingTbl removeBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().remove(bookingTbl);
		bookingTbl.setConferenceRoomTbl(null);

		return bookingTbl;
	}

	public HotelTbl getHotelTbl() {
		return this.hotelTbl;
	}

	public void setHotelTbl(HotelTbl hotelTbl) {
		this.hotelTbl = hotelTbl;
	}

	public List<ImageTbl> getImageTbls() {
		return this.imageTbls;
	}

	public void setImageTbls(List<ImageTbl> imageTbls) {
		this.imageTbls = imageTbls;
	}

	public ImageTbl addImageTbl(ImageTbl imageTbl) {
		getImageTbls().add(imageTbl);
		imageTbl.setConferenceRoomTbl(this);

		return imageTbl;
	}

	public ImageTbl removeImageTbl(ImageTbl imageTbl) {
		getImageTbls().remove(imageTbl);
		imageTbl.setConferenceRoomTbl(null);

		return imageTbl;
	}

}