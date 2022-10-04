fetch("https://fakestoreapi.com/products")
.then((record) => {
// console.log(record.json())
return record.json() })
.then((jrecord) => {
    console.log(jrecord[1].description);

    let linedata ="";
    jrecord.map((line)=> {
            linedata += `<tr><td>${line.id}.</td>
            <td>${line.title}</td>
                <td>${line.price}</td>
                <td>${line.description}</td>
                <td><img class="img" src="${line.image}" alt=""></td>
                <td>${line.rating.rate} (${line.rating.count} reviewed)</td></tr>`;

});
document.querySelector("#tablebodyrow").innerHTML=linedata;

});

