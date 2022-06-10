package com.app.java8;

public class lambdaExpression implements Runnable{

	//Before Java 8 : Implementation of Runnable interface using anonymous inner class
	
	
	//Runnable r = new Runnable() {   
        @Override
        public void run() {
            System.out.println("Runnable Implementation Using Anonymous Inner Class");
        }
        
        
   //After Java 8 : Implementation of Runnable interface using lambda expressions
        Runnable r = () -> System.out.println("Runnable Implementation Using Lambda Expressions");

		
	}

// ====================================================================================================================


 // Before Java 8 : Implementation of Comparator interface using anonymous inner class


// Comparator<Student> idComparator = new Comparator<Student>() {
//         @Override
//       public int compare(Student s1, Student s2) {
//         return s1.getID()-s2.getID();
//            }
//          };


//			After Java 8 : Implementation of Comaparator interface using lambda expressions

//			Comparator<Student> idComparator = (Student s1, Student s2) -> s1.getID()-s2.getID();


// ==========================================================================================================================




// Before Java 8 : Implementation Of ActionListener interface using anonymous inner class


// 			Label label = new Label();
         
// 			Button button = new Button("Send");
         
// 			button.addActionListener(new ActionListener() {
//   		@Override
//  		public void actionPerformed(ActionEvent e) {
//	     	label.setText("Sent");
// 			}
// 			});

// 		After Java 8 : Implementation of ActionListener interface using lambda expressions


//			Label label = new Label();
         
//			Button button = new Button("Send");
         
//			button.addActionListener((ActionEvent e) -> label.setText("Sent..."));	