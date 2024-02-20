package com.vtxlab.tdd;


public class AccountTest {
  


  private Account acount;
  account = new Account(0);


  @Test
  void testCredit(){
    assertThat(account.credit(10),is(true));
    
  }
}
