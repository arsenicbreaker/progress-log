Cara menyimpan data ada 3
1. Mapping
2. Array
3. Struct

Cara membuat function 
function namaFunction(parameter) visibility modifier returns (tipeData) {
    // isi perintah
}


Function visibility ada 4
1. public --> bisa di akses smart contract yang lain via transaksi. tetapi untuk hak akses itu bisa di konfigurasi/dibatasi. misalnya : 
    function refill(uint amount) public {
        require(msg.sender == owner, "Only the owner can refill.");
        cupcakeBalances[address(this)] += amount;
    }
artinya function refill bisa di akses di luar kontrak tetapi hanya owner yg bisa refill.
2. external --> hanya bisa dipanggil di luar kontrak
3. internal --> hanya bisa dipanggil di dalam kontrak itu sendiri & turunan/inheritence
4. private --> hanya bisa dipanggil di dalam kontrak itu sendiri