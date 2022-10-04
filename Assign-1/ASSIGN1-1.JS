fetch("https://fakestoreapi.com/products")
.then((record) => {
// console.log(record.json())
return record.json() })
.then((jrecord) => {
    console.log(jrecord[1].description);

    let linedata ="";
    jrecord.map((line)=> {
            linedata +=  `<div class="card cardwidth">
            <img class="card-img-top img" src="${line.image}" alt="Card image cap">
            <div class="card-body posioftitle">
              <h5 class="card-title">${line.title}</h5>
              <h6 class="card-title">Rs. ${line.price} /-</h6>
              <p class="card-text desc">${line.description}</p>
            </div>
            <div class="card-footer">
              <small class="text-muted">${line.rating.rate} (${line.rating.count} reviewed)</small>
            </div>
          </div>`

});
document.querySelector("#newgroup").innerHTML=linedata;

});

