package com.company;
/* Classame : Main
 *
 * Date: 23.06.2020
 * @author: Dmitriy Stavnichuk
 * */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CompanyServiceImpl service = new CompanyServiceImpl();

        Company chief = new Company(1,null,35);
        Company lawyer = new Company( 2,chief,24);
        Company developer = new Company( 3,chief,13);
        Company backEnd = new Company( 4,developer,22);
        Company devOps = new Company( 5,backEnd,14);
        Company frontEnd = new Company( 6,developer,11);
        Company design = new Company( 7,frontEnd,5);
        Company accounting = new Company(8,null,10);

//  filling list with companies
        List<Company> companies = new ArrayList<>();
        companies.add(chief);
        companies.add(lawyer);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(devOps);
        companies.add(frontEnd);
        companies.add(design);
        companies.add(accounting);

        // check on-top, on bottom, in the node,  out of chain)
        System.out.println("Top-level company for Chief is " + service.getTopLevelParent(chief));
        System.out.println("Top-level company for Design is " + service.getTopLevelParent(design));
        System.out.println("Top-level company for Dev is " + service.getTopLevelParent(developer));
        System.out.println("Top-level company for accounting is " + service.getTopLevelParent(accounting));

        System.out.println("Workers are (chief) :" + service.getEmployeeCountForCompanyAndChildren(chief, companies));
        System.out.println("Workers are (design) :" + service.getEmployeeCountForCompanyAndChildren(design, companies));
        System.out.println("Workers are (dev) :" + service.getEmployeeCountForCompanyAndChildren(developer, companies));
        System.out.println("Workers are(accounting) :" + service.getEmployeeCountForCompanyAndChildren(accounting, companies));


    }
}
