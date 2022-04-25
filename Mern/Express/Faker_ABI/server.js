const express = require("express");
const app = express();

const { faker } = require('@faker-js/faker');
const User = require("./classes/User");
const Company = require("./classes/Company");
const port = 8000;

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const createUser = ()=>{
    const newUser = new User(
        faker.datatype.number(),
        faker.internet.email(),
        faker.datatype.number(),
        faker.name.firstName(),
        faker.name.lastName()
    )
    return newUser;
}

const createCompany = () => {
    const newUser = new Company(
      faker.datatype.number(),
      faker.company.companyName(),
      {
        street: faker.address.streetName(),
        city: faker.address.cityName(),
        state: faker.address.state(),
        zipCode: faker.address.zipCode(),
        country: faker.address.country(),
      }
    );
    return newUser;
  };

  app.get("/api/users/new", (req, res) => {
    const newUser = createUser();
    res.json(newUser);
  });
  
  app.get("/api/companies/new", (req, res) => {
    const newCompany = createCompany();
    res.json(newCompany);
  });
  app.get("/api/user/company" , (req,res)=>{
    const newUser = createUser();
    const newCompany = createCompany();
    res.json({newUser,newCompany});
    // res.json(newCompany);
})
app.listen( port, () => console.log(`Listening on port: ${port}`) );