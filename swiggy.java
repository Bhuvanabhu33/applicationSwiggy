import java.util.Scanner;
class swiggy
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\t\t\t Swiggy.... \"Are you Hungry\" ");
		Thread.sleep(500);
		System.out.println("Select the Hotel ");
		System.out.println("1.Buhari");
		System.out.println("2.S.S.Hydrabadi ");
		System.out.println("3.Eat's of Arab");
		System.out.println("4.Amma canteen ");
		int hotel=s.nextInt();
		Thread.sleep(500);
		if(hotel<=4)
		{
		switch(hotel)
		{
			case 1:
				{
				System.out.println("Thank you for Selecting Buhari");
				Thread.sleep(500);
		System.out.println("Plzzz Select your food");
		System.out.println("1.Chicken biryani");
		System.out.println("2.Mutton biryani");
		System.out.println("3.Fish biryani");
		System.out.println("4.Chicken 65");
		int food=s.nextInt();
		if(food<=4)
			{
		switch(food)
			{
			case 1:
			{
			   System.out.println("Your Order is Chicken biryani");
			   Thread.sleep(1000);
			   System.out.println("plz enter the quantity");
			   int quan=s.nextInt();
			   int price=100;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
			   
				break;
			}
			case 2:
				{
				System.out.println("Your Order is Mutton biryani");
			   Thread.sleep(1000);
				System.out.println("plz enter the quantity");
				 int quan=s.nextInt();
			   int price=150;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 3:
				{
					System.out.println("Your Order is Fish biryani");
			        Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=180;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 4:
				{
					System.out.println("Your Order is Chicken 65");
			        Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=90;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}

			}
			}
			else
				{
				System.out.println("Sorry we don't have this food");
			}
           break;
		}
		
            case 2:
			{
				System.out.println("Thank you for Selecting S.S.Hydrabad");
				Thread.sleep(500);
				System.out.println("Plzzz Select your food");
		System.out.println("1.Hydrabad Special Chicken biryani");
		System.out.println("2.Hydrabad Mutton biryani");
		System.out.println("3.Hydrabad Fish biryani");
		System.out.println("4.Hydrabad Chicken 65");
		int food=s.nextInt();
		if(food<=4)
			{
		switch(food)
			{
			case 1:
			{
		   	   System.out.println("Your Order is Hydrabad Special Chicken biryani");
			   Thread.sleep(1000);
			   System.out.println("plz enter the quantity");
			   int quan=s.nextInt();
			   int price=150;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					}  
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
			   
				break;
			}
			case 2:
				{
				System.out.println("Your Order is Hydrabad Special Mutton biryani");
			   Thread.sleep(1000);
				System.out.println("plz enter the quantity");
				int quan=s.nextInt();
			   int price=200;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					}  
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 3:
				{
					System.out.println("Your Order is Hydrabad Special Fish biryani");
			   Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					int quan=s.nextInt();
			   int price=180;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					}  
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 4:
				{
					System.out.println("Your Order is Hydrabad Special Chicken 65");
			   Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					int quan=s.nextInt();
			   int price=180;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					}  
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}

			}
			}
			else
				{
				System.out.println("Sorry we don't have this food");
			}
           break;
		}
			   case 3:
			{
				System.out.println("Thank you for Selecting Eat's of Arab");
				Thread.sleep(1000);
		System.out.println("Plzzz Select your food");
		System.out.println("1.Panneer Butter Masala ");
		System.out.println("2.Naan ");
		System.out.println("3.Malai Panneer fry");
		System.out.println("4.Gobi Crunch Fries");
		int food=s.nextInt();
		if(food<=4)
			{
		switch(food)
			{
			case 1:
			{
				System.out.println("Your Order is Panneer Butter Masala ");
			   Thread.sleep(1000);
			   System.out.println("plz enter the quantity");
			   int quan=s.nextInt();
			   int price=140;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
			   
				break;
			}
			case 2:
				{
				System.out.println("Your Order is Naan ");
                Thread.sleep(1000);
				System.out.println("plz enter the quantity");
				 int quan=s.nextInt();
			   int price=120;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 3:
				{
					System.out.println("Your Order is Malai Panneer fry");
					Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=210;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 4:
				{
					System.out.println("Your Order is Gobi Crunch Fries");
					Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=160;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}

			}
			}
			else
				{
				System.out.println("Sorry we don't have this food");
			}
	               break;
			}
			case 4:
			{
				System.out.println("Thank you for Selecting Amma Canteen");
				Thread.sleep(500);
		System.out.println("Plzzz Select your food");
		System.out.println("1.Dosai ");
		System.out.println("2.Idly");
		System.out.println("3.Pongal");
		System.out.println("4.Ghee Roast");
		int food=s.nextInt();
		if(food<=4)
			{
		switch(food)
			{
			case 1:
			{
			   System.out.println("Your Order is Dosai ");
			   Thread.sleep(1000);
			   System.out.println("plz enter the quantity");
			   int quan=s.nextInt();
			   int price=70;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
			   
				break;
			}
			case 2:
				{
				System.out.println("Your Order is Idly ");
			   Thread.sleep(1000);
				System.out.println("plz enter the quantity");
				 int quan=s.nextInt();
			   int price=20;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 3:
				{
					System.out.println("Your Order is Pongal ");
			   Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=90;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}
				case 4:
				{
					System.out.println("Your Order is Ghee Roast ");
			   Thread.sleep(1000);
					System.out.println("plz enter the quantity");
					 int quan=s.nextInt();
			   int price=90;
			   double total=quan*price;
			   Thread.sleep(500);
			   System.out.println("Total Bill is "+total);
			   Thread.sleep(500);
			   System.out.println("Plz Select the payment mode");
			   System.out.println("1.Gpay");
			   System.out.println("2.Phonepay");
			   int pay=s.nextInt();
			   if(pay==1)
				{
				   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
				}
           else if(pay==2)
				{
			   System.out.println("Plz enter the amount"+total);
				   double user_amt=s.nextDouble();
				   if(user_amt==total)
					{
                       System.out.println("Generaing OTP....");
					   Thread.sleep(1000);
                       double sys_otp=Math.random()*9999+9999;
					   int otp=(int)sys_otp;
					   System.out.println(otp);
					   int user_enter_otp=s.nextInt();
					   if(otp==user_enter_otp)
						{
						   Thread.sleep(1000);
						   System.out.println("Order is received Succesfully");
						   Thread.sleep(1000);
						   System.out.println("Delivery will be done in 30 minutes ");
							
						}
						else{
							System.out.println("Incorrect otp");
						}
						
					} 
					else{
						System.out.println("payment failed");
					}
              }
			  else{
				  System.out.println("There is no payment option");
				
			  }
					break;
				}

			}
			}
			else
				{
				System.out.println("Sorry we don't have this food");
			}
				break;
				   
			}
		    default:
					   System.out.println("Thanks you");
			break;
			
            }

	               
		}
			
			else
	      {
			System.out.println("There is no hotels here");
	      }		
			
		}
		
	}
	
				

