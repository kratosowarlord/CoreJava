package Phase1.Jav.Practice;

public class encapsulation {
	
	private int securityCode;
	private String branchName;
	private int branchCode;
	private String deptName;
	private int deptCode;
	public int getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}
	
	public static void main(String[] args) {
		
		encapsulation enc = new encapsulation();
		
		enc.setSecurityCode(1234);
		enc.setBranchName("Security");
		enc.setBranchCode(289);
		enc.setDeptName("HOS");
		enc.setDeptCode(5678);
		
		
		System.out.println("The Security code is :" +enc.getSecurityCode());
		System.out.println("the Branch name is : " +enc.getBranchName());
		System.out.println("The Branch code is : " +enc.getBranchCode());
		System.out.println("The dept name is :" +enc.getDeptName());
		System.out.println("The Dept Code is : " +enc.getDeptCode());
	}
}
