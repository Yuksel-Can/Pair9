package business;

import java.util.Iterator;

import DataAccess.abstracts.CreditDao;
import core.BaseLogger;
import entities.Credit;

public class CreditManager {
	
	CreditDao creditDao;
	BaseLogger[] baseLogger;
	
	public CreditManager(CreditDao creditDao, BaseLogger[] baseLogger) {
		this.creditDao = creditDao;
		this.baseLogger = baseLogger;
	}
	
	public void save(Credit credit) {
		this.creditDao.save(credit);
		logRun(baseLogger, "kaydetme logland�");
	}
	
	public void update(Credit credit) {
		this.creditDao.update(credit);
		logRun(baseLogger, "g�ncelleme logland�");
	}
	
	public void delete(Credit credit) {
		this.creditDao.delete(credit);
		logRun(baseLogger, "silme logland�");
	}
	
	public void creditApply(Credit credit, double claimAmount) {
		if(claimAmount<credit.getMinCreditLimit()) {
			System.out.println("Talep edilen tutar �ok d���kt�r");
		}else if(claimAmount>credit.getMaxCreditLimit()) {
			System.out.println("Talep edilen tutar �ok fazlad�r");
		}else {
			System.out.println("Talebiniz ba�ar�yla al�nm��t�r, Tutar: " + claimAmount + ", Kredi: " + credit.getName());
			logRun(baseLogger, "Kredi talebi logland�");
		}
	}
	
	public void logRun(BaseLogger[] loggers, String message) {
		for(BaseLogger logger : loggers) {
			logger.log(message);
		}
	}

}
