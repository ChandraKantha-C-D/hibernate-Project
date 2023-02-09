package com.ty.Controller;

import java.util.Scanner;

import com.ty.Dao.AddressDao;
import com.ty.Dao.BranchDao;
import com.ty.Dao.EncounterDao;
import com.ty.Dao.HospitalDao;
import com.ty.Dao.Med_Items_Dao;
import com.ty.Dao.Med_Orders_Dao;
import com.ty.Dao.PersonDao;
import com.ty.Dto.Address;
import com.ty.Dto.Branch;
import com.ty.Dto.Encounter;
import com.ty.Dto.Hospital;
import com.ty.Dto.Med_Items;
import com.ty.Dto.Med_Orders;
import com.ty.Dto.Person;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		do {

			System.out.println(" 1 . Hospital Details \n 2 . Branch Details \n 3 . Address Details \n 4 . Person Details \n 5 . To Encounter \n 6 . Med_Orders");
			System.out.println(" 7 . Med_Items \n 8 . To Exit");
			System.out.println("Select Your Choice ");
			int chioce = scanner.nextInt();

			switch (chioce) {
			case 1: {
				Hospital hospital = new Hospital();
				HospitalDao dao = new HospitalDao();
				boolean repeat1 = true;
				do {

					System.out.println(" 1 . To insert Hospital  \n 2 . To update Hospital \n 3 . To delete Hospital \n 4 . To fetch Hospital by Id \n 5 . To get All Hospital \n 6 . To Exit");
					System.out.println("Select Your Choice ");
					int choice1 = scanner.nextInt();
					// start 1
					switch (choice1) {
					case 1: {
						System.out.println("Enter the Hospital name");
						String name = scanner.next();
						System.out.println("Enter the Hospital Gst");
						String gst = scanner.next();

						hospital.setHospital_name(name);
						hospital.setGst(gst);

						dao.saveHospital(hospital);

						System.out.println("Hospital Saved");

					}break;

					case 2: {
						System.out.println("enter the Hospital Id to be update ");
						int h_id = scanner.nextInt();
						System.out.println("Enter the Hospital name to be updated ");
						String h_name = scanner.next();

						dao.updateHospital(h_id, h_name);
						System.out.println("Hospital name Updated");

					}break;

					case 3: {
						System.out.println("enter the Hospital Id to be delete ");
						int h_id = scanner.nextInt();

						dao.deleteHospital(h_id);
						System.out.println("Hospital Deleted");

					}break;

					case 4: {
						System.out.println("enter the Hospital Id to be fetch ");
						int h_id = scanner.nextInt();

						dao.getHospitalById(h_id);

					}break;

					case 5: {
						System.out.println(dao.getAllHospital());

					}break;

					case 6: {
						repeat1 = false;
					}break;

					}// end 1

				} while (repeat1);

			}break;

			case 2: {
				Branch branch = new Branch();
				BranchDao dao = new BranchDao();
				boolean repeat1 = true;
				do {
					System.out.println("Select Your Choice ");
					System.out.println(
							" 1 . To insert Branch  \n 2 . To update Branch \n 3 . To delete Branch \n 4 . To fetch Branch by Id \n 5 . To get All Branch \n  6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 2
					switch (choice1) {
					case 1: {
						System.out.println("Enter the Branch name");
						String name = scanner.next();
						System.out.println("Enter the Branch Contact number");
						long phoneno = scanner.nextLong();
						System.out.println("Enter the Hospital Id to add Branch ");
						int h_id = scanner.nextInt();

						branch.setBranch_name(name);
						branch.setPhoneno(98745);

						dao.saveBranch(h_id, branch);

						System.out.println("Branch Saved");

					}break;

					case 2: {
						System.out.println("enter the Branch Id to be update ");
						int b_id = scanner.nextInt();
						System.out.println("Enter the Branch name to be updated ");
						String b_name = scanner.next();

						dao.updateBranch(b_id, b_name);
						System.out.println("Branch name Updated");

					}break;

					case 3: {
						System.out.println("enter the Branch Id to be delete ");
						int b_id = scanner.nextInt();

						dao.deleteBranch(b_id);
						System.out.println("Branch Deleted");

					}break;

					case 4: {
						System.out.println("enter the Branch Id to be fetch ");
						int b_id = scanner.nextInt();

						dao.getBranchById(b_id);

					}break;

					case 5: {
						System.out.println(dao.getAllBranches());

					}break;

					case 6: {
						repeat1 = false;
					}break;

					}// end 2

				} while (repeat1);

			}break;

			case 3: {
				
				boolean repeat1 = true;
				do {
					System.out.println("Select Your Choice ");
					System.out.println(
							" 1 . To insert Address  \n 2 . To update Address \n 3 . To delete Address \n 4 . To fetch Address by Id \n 5 . To get All Address \n 6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 3
					switch (choice1) {
					case 1:{
						System.out.println("enter address: ");
						String adress=scanner.next();
						System.out.println("enter branch id:");
						int branch_id=scanner.nextInt();
						Address addres=new Address();
						addres.setAddress(adress);
						AddressDao addressdao=new AddressDao();
						addressdao.saveAddress(branch_id, addres);
						System.out.println("saved");
						}break; //end case1
						
						case 2:{
						System.out.println("enter addres id:");
						int address_id=scanner.nextInt();
						System.out.println("enter address: ");
						String address=scanner.next();
						AddressDao addressdao=new AddressDao();
						addressdao.updateAddress(address_id, address);
						System.out.println("updated");
						}break; //case 2
						
						case 3:{
						System.out.println("enter addres id:");
						int address_id=scanner.nextInt(); 
						AddressDao addressdao=new AddressDao();
						addressdao.deleteAddress(address_id);
						}break;//end case3
						
						case 4:{
						System.out.println("enter addres id:");
						int address_id=scanner.nextInt(); 
						AddressDao addressdao=new AddressDao(); 
						addressdao.getAddressById(address_id);
						}break; //end case4
						
						case 5:{
						AddressDao addressdao=new AddressDao(); 
						System.out.println(addressdao.getAllAddress());
						}break; //end case 5
						
						case 6:{
						repeat1=false;
						}break;


					}// end 3

				} while (repeat1);

			}break;

			case 4: {
				boolean repeat1 = true;
				do {
					Person person = new Person();
					PersonDao dao = new PersonDao();
					System.out.println("Select Your Choice ");
					System.out.println(
							" 1 . To insert Person  \n 2 . To update Person \n 3 . To delete Person \n 4 . To fetch Person by Id \n 5 . To get All Person \n 6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 4
					switch (choice1) {
					case 1: {
						System.out.println("Enter the Person name");
						String name = scanner.next();
						System.out.println("Enter the Person address");
						String address = scanner.next();
						System.out.println("Enter the Person contact number");
						Long contact = scanner.nextLong();
						
						person.setPerson_name(name);
						person.setPerson_address(address);
						person.setPerson_contact_number(contact);
						
						dao.savePerson(person);

						System.out.println("Person Saved");

					}break;

					case 2: {
						System.out.println("enter the Person Id to be update ");
						int p_id = scanner.nextInt();
						System.out.println("Enter the Person name to be updated ");
						String p_name = scanner.next();

						dao.updatePerson(p_id, p_name);
						System.out.println("Person name Updated");

					}break;

					case 3: {
						System.out.println("enter the Person Id to be delete ");
						int p_id = scanner.nextInt();

						dao.deletePerson(p_id);
						System.out.println("Person Deleted");

					}break;

					case 4: {
						System.out.println("enter the Person Id to be fetch ");
						int p_id = scanner.nextInt();

						dao.getPersonById(p_id);

					}break;

					case 5: {
						System.out.println(dao.getAllPerson());

					}break;

					case 6: {
						repeat1 = false;
					}break;

 
					}// end 4

				} while (repeat1);

			}break;

			case 5: {
				boolean repeat1 = true;
				do {
					Encounter encounter = new Encounter();
				    EncounterDao encounterDao = new EncounterDao();
					System.out.println("Select Your Choice ");
					System.out.println(
							" 1 . To insert Encounter  \n 2 . To update Encounter \n 3 . To delete Encounter \n 4 . To fetch Encounter by Id \n 5 . To get All Encounter \n 6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 5
					switch (choice1) {
					case 1:{
						System.out.println("enter reason: "); 
						String reason=scanner.next();
						System.out.println("enter branch id "); 
						int branch_id=scanner.nextInt();
						System.out.println("enter person id: ");
						int person_id=scanner.nextInt();
						
						encounter.setReason(reason);
						
						encounterDao.saveEncounter(person_id, branch_id, encounter);
						System.out.println("saved");
						}break; //end case1
						
					case 2: {
						System.out.println("enter hospital id: ");
						int hospital_id = scanner.nextInt();
						System.out.println("enter the hospital name u wanto update: ");
						String hospital_name = scanner.next();
						HospitalDao hospitaldao = new HospitalDao();
						hospitaldao.updateHospital(hospital_id, hospital_name);
						System.out.println("updated successfully");
						}
						break;

						
//						case 2:{
//						System.out.println("enter encounter id: ");
//						int encounter_id=scanner.nextInt();
//						System.out.println("enter Branch_id: ");
//						int branch_id=scanner.nextInt();
//						System.out.println("enter reason: "); 
//						String reason=scanner.next();
//						
//						encounterDao.updateEncounter(encounter_id, branch_id , reason);
//						}break; //end case2
						
						case 3:{
						System.out.println("enter encounter id: ");
						int encounter_id=scanner.nextInt();
						
						encounterDao.deleteEncounter(encounter_id);
						System.out.println("deleted");
						}break; //end case3
						
						case 4:{
						System.out.println("enter encounter id: ");
						int encounter_id=scanner.nextInt();
						encounterDao.getEncounterById(encounter_id);
						}break; //end case4
						
						case 5:{
						System.out.println(encounterDao.getAllEncounters()); 
						}break; //end case5
						
						case 6:{
						repeat1=false;
						}break; //end case6


					}// end 5

				} while (repeat1);

			}break;

			case 6: {
				      
				boolean repeat1 = true;
				do {
					 Med_Orders med_Orders=new Med_Orders();
				       Med_Orders_Dao dao=new Med_Orders_Dao();
					System.out.println("Select Your Choice ");
					System.out.println(
							" 1 . To insert Med_Orders  \n 2 . To update Med_Orders \n 3 . To delete Med_Orders \n 4 . To fetch Med_Orders by Id \n 5 . To get All Med_Orders \n 6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 6
					switch (choice1) {
					case 1: {
						        System.out.println("enter the doctor name:");
						          String name=scanner.next();
						          System.out.println("enter the encounter id"); 
						          int encounter_id=scanner.nextInt();
						          
						            med_Orders.setDoctor(name);
						            dao.saveMedOrders(med_Orders, encounter_id);
						            System.out.println("saved");
						             }break;

					case 2: {
                                  System.out.println("enter med order id: ");
                                  int medorder_id=scanner.nextInt();
                                  System.out.println("enter the doctor name:");
						          String name=scanner.next();
						          dao.updateMedOrder(medorder_id, name);
						          System.out.println("updated");
						          }break;

					case 3: {
						       System.out.println("enter med order id: ");
                                int medorder_id=scanner.nextInt();
                                dao.deleteMedOrder(medorder_id);
                                 System.out.println("deleted");

					}break;

					case 4: {
						 System.out.println("enter med order id: ");
                         int medorder_id=scanner.nextInt();
                         dao.getMedOrderById(medorder_id);
                         
					}break;

					case 5: {
						         System.out.println(dao.getAllMedorders()); 
					}break;

					case 6: {
						repeat1 = false;
					}break;

					}// end 6

				} while (repeat1);

			}break;

			case 7: {
				Med_Items med_Items  = new Med_Items();
				Med_Items_Dao dao = new Med_Items_Dao();
				boolean repeat1 = true;
				do {
					System.out.println("Select Your Choice ");
					System.out.println(
							
							" 1 . To insert Med_Items  \n 2 . To update Med_Items \n 3 . To delete Med_Items \n 4 . To fetch Med_Items by Id \n 5 . To get All Med_Items \n 6 . To Exit");
					int choice1 = scanner.nextInt();
					// start 7
					switch (choice1) {
					case 1: {
						System.out.println("Enter the med_item name");
						String name = scanner.next();
						System.out.println("Enter the med_item price");
						double price = scanner.nextDouble();
						System.out.println("Enter the med_Oders id");
						int m_id = scanner.nextInt(); 
						
						med_Items.setMed_item_name(name);
						med_Items.setMed_item_price(price);
						
						dao.saveMedItems(med_Items, m_id);
						
						System.out.println("Med_Items Saved");

					}break;

					case 2: {
						System.out.println("enter the med_item Id to be update ");
						int m_id = scanner.nextInt();
						System.out.println("Enter the med_item name to be updated ");
						String m_name = scanner.next();

						dao.updateMedItems(m_id, m_name);
						System.out.println("med_item name Updated");

					}break;

					case 3: {
						System.out.println("enter the med_item Id to be delete ");
						int m_id = scanner.nextInt();

						dao.deleteMedItems(m_id);
						System.out.println("med_item Deleted");

					}break;

					case 4: {
						System.out.println("enter the med_item Id to be fetch ");
						int p_id = scanner.nextInt();

						dao.getALlMedItems();

					}break;

					case 5: {
						System.out.println(dao.getALlMedItems());

					}break;

					case 6: {
						repeat1 = false;
					}break;

					}// end 7

				} while (repeat1);

			}break;

			case 8: {
				repeat = false;
				System.out.println(" Thank You");
			}break;

			}// End of Switch case

		} while (repeat);

	}

}
