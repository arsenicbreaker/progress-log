ERC-20 > framework untuk buat token

mapping (address =>
    mapping(address => uint256)
    ) public allowances;

allowances[owner][spender] = 

memori ada slotnya, urutan field itu penting
uint128 a: uint256 b; uint128 c --> bad 
uint129 a; uint128 c; uint256 b --> good

function active(uint256 id) external {
    proposals[id].state =
     proposalState.active();
}

function virtual -> dia bisa dipanggil oleh kontrak yg lain terus kontrak tsb diubah
override --> mengambil akses dari virtual function

Interface: 
untuk menyamakan format, untuk buat struktur