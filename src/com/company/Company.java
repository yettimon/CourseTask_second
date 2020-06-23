package com.company;
/* Classame : Company
 *
 * Date: 23.06.2020
 * @author: Dmitriy Stavnichuk
 * */

import java.util.Objects;

public class Company {

        // parent for this company nullable, when there is no parent for this company
        private int id;
        private Company parent;
        private int employeesCount;

        // constructor
        public Company(int id, Company parent, int employeesCount) {
            this.parent = parent;
            this.employeesCount = employeesCount;
            this.id = id;
        }
        // interface method
        public Company getParent() {
            return parent;
        }
        //getter setters
        public void setParent(Company parent) {
            this.parent = parent;
        }

        public int getEmployeesCount() {
            return employeesCount;
        }

        public void setEmployeesCount(int employeesCount) {
            this.employeesCount = employeesCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        // toString method

        @Override
        public String toString() {
            return "Company{" +
                    "parent=" + parent +
                    ", employeesCount=" + employeesCount +
                    ", id=" + id +
                    '}';
        }
    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

