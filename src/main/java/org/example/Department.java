
package org.example;

/**
 * Represents a department in the employees database.
 */
public class Department
{
    private String deptNo;
    private String deptName;

    /**
     * Creates a department.
     *
     * @param deptNo Department number
     * @param deptName Department name
     */
    public Department(String deptNo, String deptName)
    {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public String getDeptNo()
    {
        return deptNo;
    }

    public void setDeptNo(String deptNo)
    {
        this.deptNo = deptNo;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    @Override
    public String toString()
    {
        return "Department{" +
                "deptNo='" + deptNo + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
