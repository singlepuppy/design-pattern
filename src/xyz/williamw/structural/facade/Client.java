package xyz.williamw.structural.facade;

/**
 * @author William.W
 * @description 客户端,
 *      投资者使用FundFacade外观对象进行投资，
 *      只需要买入基金即可，不需要关注股票、房地产、国债等投资方式
 * @date 2020/5/7 15:55:20
 */
public class Client {
    public static void main(String[] args) {
        FundFacade fundFacade = new FundFacade();
        fundFacade.buyFund();
        System.out.println("投资一定时间》》》《《《《");
        fundFacade.sellFund();
    }
}
