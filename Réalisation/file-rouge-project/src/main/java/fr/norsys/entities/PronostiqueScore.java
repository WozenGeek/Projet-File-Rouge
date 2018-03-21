package fr.norsys.entities;

import java.time.LocalDate;

public class PronostiqueScore extends PronostiqueVote {

	private int scoreHotePrevision;
	private int scoreInvitePrevision;

	public PronostiqueScore(int id, LocalDate datePronostique, String heurePronostique, int resultatPronostique,
			TypeVictoire typeVictoire, Employe employe, Match matche, int scoreHotePrevision,
			int scoreInvitePrevision) {
		super(id, datePronostique, heurePronostique, resultatPronostique, typeVictoire, employe, matche);
		this.scoreHotePrevision = scoreHotePrevision;
		this.scoreInvitePrevision = scoreInvitePrevision;
	}

	public PronostiqueScore(int id, LocalDate datePronostique, String heurePronostique, int resultatPronostique,
			TypeVictoire typeVictoire, Employe employe, Match matche) {
		super(id, datePronostique, heurePronostique, resultatPronostique, typeVictoire, employe, matche);
		// TODO Auto-generated constructor stub
	}

	public int getScoreHotePrevision() {
		return scoreHotePrevision;
	}

	public void setScoreHotePrevision(int scoreHotePrevision) {
		this.scoreHotePrevision = scoreHotePrevision;
	}

	public int getScoreInvitePrevision() {
		return scoreInvitePrevision;
	}

	public void setScoreInvitePrevision(int scoreInvitePrevision) {
		this.scoreInvitePrevision = scoreInvitePrevision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + scoreHotePrevision;
		result = prime * result + scoreInvitePrevision;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PronostiqueScore other = (PronostiqueScore) obj;
		if (scoreHotePrevision != other.scoreHotePrevision)
			return false;
		if (scoreInvitePrevision != other.scoreInvitePrevision)
			return false;
		return true;
	}

	
}