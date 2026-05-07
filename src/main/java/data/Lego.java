package data;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lego")
public class Lego {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int run;
	private int speed;
	private int turn;
	private Timestamp aika=new Timestamp(System.currentTimeMillis());
	private float vari;
	private float syvyys;
	private float distanceForward;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Timestamp getAika() {
		return aika;
	}
	public void setAika(Timestamp aika) {
		this.aika = aika;
	}

	public float getVari(){
		return vari;
	}

	public void setVari(float vari){
		this.vari = vari;
	}
	public float getSyvyys(){
		return syvyys;
	}

	public void setSyvyys(float syvyys){
		this.syvyys = syvyys;
	}

	public float getDistanceForward(){
		return distanceForward;
	}

	public void setDistanceForward(float distanceForward){
		this.distanceForward = distanceForward;
	}

}
