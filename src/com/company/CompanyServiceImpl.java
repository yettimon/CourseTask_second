package com.company;
/* Classame : CompanyServiceImpl
 *
 * Date: 23.06.2020
 * @author: Dmitriy Stavnichuk
 * */

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {

    public CompanyServiceImpl() {}


    //getTopLevelParent
    @Override
    public Company getTopLevelParent(Company child) {
        while (child.getParent() != null) {
            child = child.getParent();
        }

        return child;
    }
    // get counting for employee for both company and children
    @Override
    public int getEmployeeCountForCompanyAndChildren
            (Company company, List<Company> companies) {
        int counter = company.getEmployeesCount();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getParent() == company) {
                counter += getEmployeeCountForCompanyAndChildren(companies.get(i), companies);
            }
        }
        return counter;
    }

}

