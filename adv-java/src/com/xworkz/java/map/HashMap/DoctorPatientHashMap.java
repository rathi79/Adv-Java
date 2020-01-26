package com.xworkz.java.map.HashMap;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DoctorPatientHashMap {

	public static void main(String[] args) {
		Doctor asha=new Doctor("Asha","Adv-Java",5.0f);
		Doctor omkar=new Doctor("Omkar","Framework",10.0f);
		Doctor devendra=new Doctor("Devendra","J2EE",3.0f);
		Doctor varun=new Doctor("Varun","SQL",6.0f);
		Doctor pavan=new Doctor("Pavan","Project",4.0f);
		
		Patient deepak = new Patient("Deepak", "Java", 22);
		Patient kartik = new Patient("Kartik", "Java", 23);
		Patient nikuj = new Patient("Nikuj", "Framework", 20);
		Patient paras = new Patient("Paras", "Framework", 24);
		Patient anushree = new Patient("Anushree", "J2EE", 22);
		Patient naresh = new Patient("Naresh", "J2EE", 23);
		Patient anil = new Patient("Anil", "SQL", 24);
		Patient sabiya = new Patient("Sabiya", "SQL", 24);
		Patient ambika = new Patient("Ambika", "Project", 22);
		Patient vijay = new Patient("Vijay", "Project", 24);
		
		Set<Patient> javaPatients=new HashSet<Patient>();
		javaPatients.add(deepak);
		javaPatients.add(kartik);
		
		Set<Patient> frameworkPatients=new HashSet<Patient>();
		frameworkPatients.add(nikuj);
		frameworkPatients.add(paras);
		
		Set<Patient> j2eePatients=new HashSet<Patient>();
		j2eePatients.add(anushree);
		j2eePatients.add(naresh);
		
		Set<Patient> sqlPatients=new HashSet<Patient>();
		sqlPatients.add(anil);
		sqlPatients.add(sabiya);
		
		Set<Patient> projectPatients=new HashSet<Patient>();
		projectPatients.add(ambika);
		projectPatients.add(vijay);
		
		Map<Doctor,Set<Patient>> doctorAndPatients=new HashMap<Doctor,Set<Patient>>();
		doctorAndPatients.put(asha, javaPatients);
		doctorAndPatients.put(omkar, frameworkPatients);
		doctorAndPatients.put(devendra, j2eePatients);
		doctorAndPatients.put(varun, sqlPatients);
		doctorAndPatients.put(pavan, projectPatients);
		
	
		
		System.out.println("List of patients treated by Dr. Asha");
		System.out.println("*********************");
		
		for(Map.Entry<Doctor,Set<Patient>> doctorAndPatientsEntry:doctorAndPatients.entrySet()) {
			Doctor doctor=doctorAndPatientsEntry.getKey();
			if(doctor.name.equals("Asha")){
				Set<Patient> getPatient=doctorAndPatientsEntry.getValue();
				 for(Patient patient:getPatient) {
					 System.out.println(patient.name);				
					 }
			}
		}
		
		

	}

}
