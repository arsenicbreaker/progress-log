// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

import "@openzeppelin/contracts/token/ERC20/ERC20.sol";
import "@openzeppelin/contracts/access/Ownable.sol";

contract MyToken is ERC20, Ownable {
    constructor(string memory name, string memory symbol) ERC20("Surabaya","SBY") Ownable(msg.sender) {
        _mint(msg.sender, 1_000_000 * 10**18);
    }

    function mint(address to, uint256 amount) public onlyOwner {
        _mint(to,amount);
    }
}