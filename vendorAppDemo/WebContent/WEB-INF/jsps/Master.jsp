<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
    overflow: hidden;
    background-color: #333;
    font-family: Arial;
}
.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>


<div class="navbar">
  <a href="#home">Home</a>
  
  <!-- Location Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Location 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regLoc">Register</a>
      <a href="getAllLoc">View All</a>
      <a href="locReport">Charts</a>
      
    </div>
  </div>
  <!-- Location Menu END -->
    <!-- User Menu options -->
  <div class="dropdown">
    <button class="dropbtn">User
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="saveUser">Register</a>
      <a href="getAllUser">View All</a>
      
    </div>
  </div>
  <!-- User END -->
  
  <!-- Item Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Item
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regItm">Register</a>
      <a href="getAllItm">View All</a>
      
    </div>
  </div>
  <!-- ItemMenu END -->
  
  
  <!-- CustomerED Menu options -->
  <div class="dropdown">
    <button class="dropbtn">CustomerED
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regCustED">Register</a>
      <a href="getAllItm">View All</a>
      
    </div>
  </div>
  <!-- CustomerED END -->
  
  <!-- Document Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Document
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regDoc">Upload</a>
    </div>
  </div>
  <!-- Document Menu END -->
  
  <!-- Customer Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Customer
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regCus">Register</a>
      <a href="getAllCus">View All</a>
      
    </div>
  </div>
  <!-- Customer Menu END -->
  
  
  <!-- VENDOR Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Vendor 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regVen">Register</a>
      <a href="getAllVendor">View All</a>
    </div>
    <!-- VENDOR Menu options END -->
    
    
  </div>
</div>