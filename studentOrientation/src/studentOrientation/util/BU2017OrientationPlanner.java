package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 */
import studentOrientation.store.Results;
import studentOrientation.util.BuyBooks.BuyBooksEn;
import studentOrientation.util.CampusTour.CampusTourEn;
import studentOrientation.util.Registration.RegistrationEn;
import studentOrientation.util.SelectingDorm.SelectingDormEn;
/**
 * Orientation planner class that makes orientation schedule 
 * as per the input provided and estimates the cost accordingly.
 */
public class BU2017OrientationPlanner extends OrientationPlanner{
	private CampusTourEn ct;
	private BuyBooksEn bb;
	private SelectingDormEn sd;
	private RegistrationEn rg;
	private Results re;
	private CampusTourInterface cti;
	private BuyBooksInterface bbi;
	private SelectingDorm sdi;
	private RegistrationInterface rgi;
	
	/**
	 * Constructor takes enum as inputs and 
	 * initializes the objects for various activities
	 * @param ctIn
	 * @param bbIn
	 * @param sdIn
	 * @param rgIn
	 * @param reIn
	 */
	public BU2017OrientationPlanner(CampusTourEn ctIn, BuyBooksEn bbIn, SelectingDormEn sdIn, RegistrationEn rgIn, Results reIn){
		Logger.writeOutput("Constructor of BU2017OrientationPlanner class is called.", 3);
		ct = ctIn;
		bb = bbIn;
		sd = sdIn;
		rg = rgIn;
		setRe(reIn);
		cti = new CampusTour();
		bbi = new BuyBooks();
		sdi = new SelectingDorm();
		rgi = new Registration();
	}
	
	/**
	 * Method to select the option for campus tour
	 * and estimate the costs associated with it.
	 */
	@Override
	void campusTour() {
		switch(ct){
		case BusRide:
			busRide();
			break;
		case OnFoot:
			onFoot();
			break;
		default:
		}
	}
	
	/**
	 * Method estimate the costs associated with 
	 * BUS RIDE option for Campus Tour
	 */
	public void busRide(){
		Logger.writeOutput("Student has selected BUS RIDE option for Campus Tour...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + cti.getBusRideDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+cti.getBusRideDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + cti.getBusRideCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+cti.getBusRideCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + cti.getBusRideCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+cti.getBusRideCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + cti.getBusRideEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+cti.getBusRideEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}
	
	/**
	 * Method estimate the costs associated with 
	 * ON FOOT option for Campus Tour
	 */
	public void onFoot(){
		Logger.writeOutput("Student has selected ON FOOT option for Campus Tour...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + cti.getOnFootDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+cti.getOnFootDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + cti.getOnFootCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+cti.getOnFootCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + cti.getOnFootCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+cti.getOnFootCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + cti.getOnFootEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+cti.getOnFootEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}

	/**
	 * Method to select the bookStore for buying books.
	 */
	@Override
	void buyBooks() {
		switch(bb){
		case UniBookStore:
			uniBookStore();
			break;
		case MandoBooks:
			mandoBooks();
			break;
		default:
		}
	}
	
	/**
	 * Method to estimate the costs associated with 
	 * UNIVERSITY BOOK STORE option for Buy Books
	 */
	public void uniBookStore(){
		Logger.writeOutput("Student has selected UNIVERSITY BOOK STORE option for Buy Books...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + bbi.getUniBookStoreDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+bbi.getUniBookStoreDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + bbi.getUniBookStoreCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+bbi.getUniBookStoreCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + bbi.getUniBookStoreCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+bbi.getUniBookStoreCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + bbi.getUniBookStoreEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+bbi.getUniBookStoreEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}
	
	/**
	 * Method to estimate the costs associated with 
	 * MANDO BOOKS option for Buy Books
	 */
	public void mandoBooks(){
		Logger.writeOutput("Student has selected MANDO BOOKS option for Buy Books...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + bbi.getMandoBooksDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+bbi.getMandoBooksDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + bbi.getMandoBooksCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+bbi.getMandoBooksCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + bbi.getMandoBooksCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+bbi.getMandoBooksCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + bbi.getMandoBooksEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+bbi.getMandoBooksEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}

	/**
	 * Method to select option for selecting dorm.
	 */
	@Override
	void selectDorm() {
		switch(sd){
		case LongQueue:
			longQueue();
			break;
		case OnlineGaming:
			onlineGaming();
			break;
		default:
		}
	}
	
	/**
	 * Method to estimate the costs associated with 
	 * LONG QUEUE option for Selecting Dorm
	 */
	public void longQueue(){
		Logger.writeOutput("Student has selected LONG QUEUE option for Selecting Dorm...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + sdi.getLongQueueDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+sdi.getLongQueueDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + sdi.getLongQueueCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+sdi.getLongQueueCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + sdi.getLongQueueCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+sdi.getLongQueueCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + sdi.getLongQueueEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+sdi.getLongQueueEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}
	
	/**
	 * Method to estimate the costs associated with 
	 * ONLINE GAMING option for Selecting Dorm
	 */
	public void onlineGaming(){
		Logger.writeOutput("Student has selected ONLINE GAMING option for Selecting Dorm...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + sdi.getOnlineGamingDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+sdi.getOnlineGamingDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + sdi.getOnlineGamingCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+sdi.getOnlineGamingCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + sdi.getOnlineGamingCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+sdi.getOnlineGamingCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + sdi.getOnlineGamingEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+sdi.getOnlineGamingEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}
	
	/**
	 * Method to select the option for Course Registration.
	 */
	@Override
	void registration() {
		switch(rg){
		case Form:
			form();
			break;
		case RegSystem:
			regSystem();
			break;
		default:
		}
	}
	
	/**
	 * Method to estimate the costs associated with
	 * FORM option for Registering Courses
	 */
	public void form(){
		Logger.writeOutput("Student has selected FORM option for Registration...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + rgi.getFormDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+rgi.getFormDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + rgi.getFormCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+rgi.getFormCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + rgi.getFormCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+rgi.getFormCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + rgi.getFormEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+rgi.getFormEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}
	
	/**
	 * Method to estimate the costs associated with
	 * RegSystem option for Registering Courses
	 */
	public void regSystem(){
		Logger.writeOutput("Student has selected REGISTRATION SYSTEM option for Registration...", 2);
		Orientation studOrn = re.getOrnd();
		int duration = studOrn.getDuration() + rgi.getRegSystemDuration();
		Logger.writeOutput("[Current Duration: "+studOrn.getDuration()+"] + [Duration Add: "+rgi.getRegSystemDuration()+"] = [New Duration: "+duration+"]", 2);
		studOrn.setDuration(duration);
		double cost = studOrn.getCost() + rgi.getRegSystemCost();
		Logger.writeOutput("[Current Cost: "+studOrn.getCost()+"] + [Cost Add: "+rgi.getRegSystemCost()+"] = [New Cost: "+cost+"]", 2);
		studOrn.setCost(cost);
		int co2 = studOrn.getCarbonFootprint() + rgi.getRegSystemCarbonFootprint();
		Logger.writeOutput("[Current CO2: "+studOrn.getCarbonFootprint()+"] + [CO2 Add: "+rgi.getRegSystemCarbonFootprint()+"] = [New CO2: "+co2+"]", 2);
		studOrn.setCarbonFootprint(co2);
		int efforts = studOrn.getEfforts() + rgi.getRegSystemEffort();
		Logger.writeOutput("[Current Efforts: "+studOrn.getEfforts()+"] + [Efforts Add: "+rgi.getRegSystemEffort()+"] = [New Efforts: "+efforts+"]", 2);
		studOrn.setEfforts(efforts);
		re.setOrnd(studOrn);
	}

	public CampusTourEn getCt() {
		return ct;
	}

	public void setCt(CampusTourEn ct) {
		this.ct = ct;
	}

	public BuyBooksEn getBb() {
		return bb;
	}

	public void setBb(BuyBooksEn bb) {
		this.bb = bb;
	}

	public SelectingDormEn getSd() {
		return sd;
	}

	public void setSd(SelectingDormEn sd) {
		this.sd = sd;
	}

	public RegistrationEn getRg() {
		return rg;
	}

	public void setRg(RegistrationEn rg) {
		this.rg = rg;
	}

	public Results getRe() {
		return re;
	}

	public void setRe(Results re) {
		this.re = re;
	}

	public CampusTourInterface getCti() {
		return cti;
	}

	public void setCti(CampusTourInterface cti) {
		this.cti = cti;
	}

	public BuyBooksInterface getBbi() {
		return bbi;
	}

	public void setBbi(BuyBooksInterface bbi) {
		this.bbi = bbi;
	}

	public SelectingDorm getSdi() {
		return sdi;
	}

	public void setSdi(SelectingDorm sdi) {
		this.sdi = sdi;
	}

	public RegistrationInterface getRgi() {
		return rgi;
	}

	public void setRgi(RegistrationInterface rgi) {
		this.rgi = rgi;
	}
	
}
