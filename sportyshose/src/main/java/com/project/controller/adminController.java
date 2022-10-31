package com.project.controller;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.entity.Admin;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.repository.adminRepository;
import com.project.repository.custRepository;
import com.project.repository.productRepository;
import com.project.service.adminService;


@Controller
public class adminController {

	
	@Autowired
	adminRepository adminrepository;
	
	@Autowired
	 private custRepository custrepository;
	
	@Autowired
	productRepository productrepository;
	
	
	@GetMapping("/")
	public String show1()
	{   
		return "show";
	}

	
	//display admin functionality login form
	@GetMapping("loginadmin")
	public ModelAndView save(){
		 ModelAndView mav=new  ModelAndView("login-admin");
		 Admin admin=new Admin();
		 mav.addObject("admin",admin);
		return  mav;
	}

	
	
	//save admin data
	@PostMapping("/saveadmin")
	public String saveadmin1(@ModelAttribute Admin admin)
	{	
	        adminrepository.save(admin);
		    return "login";
		
		}
  	
  	  	
   //display update password form
  	@GetMapping("/updateadmin")
  		public ModelAndView showUpdateForm(@RequestParam int id)
  		{
  			 ModelAndView mav=new  ModelAndView("login");
  			 Admin admin=new Admin();
  			 admin=adminrepository.findById(id).get();
  			System.out.println(admin.getId());
  			System.out.println(admin.getAname());

  			 if(!admin.equals(null))
  		   mav.addObject("admin",admin);
  			return  mav;
  		}
  	
   	  
  	//display all customers
     @GetMapping("/ShowCustomers")	    
     public ModelAndView showcust()
     {  ModelAndView mav=new ModelAndView("custlist");
     Iterable<Customer> list=custrepository.findAll();
         mav.addObject("customers" ,list);
    	 return mav;
     }
     //display all prodcuts
     @GetMapping({"/ShowProducts","/pproductlist"})	    
     public ModelAndView showproduct()
     {  ModelAndView mav=new ModelAndView("productlist");
     Iterable <Product> list=productrepository.findAll();
         mav.addObject("products" ,list);
    	 return mav;
     }
     //==========================================
     @GetMapping("/Change")
		public ModelAndView Q()
		{
			 ModelAndView mav=new  ModelAndView("updatepasswordform");
			Admin admin=new Admin();
			 mav.addObject("admin",admin);
			return  mav;
		
			 
		}
  
  //save function for product
       @PostMapping("/u")
	public String QQ(@ModelAttribute Admin admin)
	{	 
 	 adminrepository.save(admin);
	     return "login";
	}
     
        
     //=============================================
    // display form to add product details
     @GetMapping("/add_product")
		public ModelAndView addProductForm()
		{
			 ModelAndView mav=new  ModelAndView("addproductform");
			 Product pro=new Product();
			 mav.addObject("product",pro);
			return  mav;
		}
     
     //save function for product
     @PostMapping("/addproduct1")
   	public String addP(@ModelAttribute Product product)
   	{	 
    	 productrepository.save(product);
   	     return "redirect:/pproductlist";
   	}
   		//update function for product
     @GetMapping("/update_product")
		public ModelAndView updateProductForm(@RequestParam int productid)
		{
			 ModelAndView mav=new  ModelAndView("addproductform");
			  Product pro=new Product();
			 pro= productrepository.findById(productid).get();
			 mav.addObject("product",pro);
			return  mav;
		}
     
     //Delete fuction for product
     @GetMapping("/delete_product")
		public String deleteProductForm(@RequestParam int productid)
		{
			  productrepository.deleteById(productid);
			  return "redirect:/pproductlist";
		}
       //forth url display
       @GetMapping("/PurchaseProducts")
        public String purchase()
 	    {   
 		return "purchasepage";
 	    }
   
     //Display purchase product  
     @GetMapping("/FilterByDate")
     public ModelAndView  showproductpurchaseD()
     { 
    	 
         {  ModelAndView mav=new ModelAndView("productlistD");
         Iterable <Customer> list=custrepository.findAll();
             mav.addObject("customer" ,list);
        	 return mav;
         }
     }
     //    FilterByCatagory

     @GetMapping("/date1")	    
     public ModelAndView  showcustbydate(@RequestParam String date)
     {  ModelAndView mav=new ModelAndView("custlistD");
     System.out.println(date);
     Iterable<Customer> list=custrepository.findByDate(date);
       mav.addObject("customers" ,list);
    	 return mav;
    	     	// return "custlistD";
    	 
     }
     
     @GetMapping("/FilterByCatagory")
     public ModelAndView  showproductpurchaseC()
     { 
    	 
         {  ModelAndView mav=new ModelAndView("productlistC");
         Iterable <Customer> list=custrepository.findAll();
             mav.addObject("customer" ,list);
        	 return mav;
         }
     }
     
     
     @GetMapping("/catagory")	    
     public ModelAndView  showcustbycatagory(@RequestParam String cat)
     {  ModelAndView mav=new ModelAndView("custlistD");
     System.out.println(cat);
     Iterable<Customer> list=custrepository.findByPcatagary(cat);
       mav.addObject("customers" ,list);
    	 return mav;
    	     	// return "custlistD";
    	 
     }
     
     @GetMapping("/custsearch")
     public ModelAndView  showsearchcustomer(@RequestParam String c)
     {  ModelAndView mav=new ModelAndView("custlistn");
     System.out.println(c);
     Iterable<Customer> list=custrepository.findByCname(c);
       mav.addObject("customers" ,list);
    	 return mav;
    	     	   	 
     }
  }
     
   


