package xyz.williamw.structural.facade;

import xyz.williamw.structural.facade.investment.*;

/**
 * @author William.W
 * @description 基金 外观类
 * 基金提供所有金融操作的简单入口，投资的用户只需要买卖基金
 * 而基金内部去处理是买卖股票还是房地产还是石油等投资产品，投资者不需要懂得上述的各种投资产品
 * 基金封装了简单的使用方式
 * @date 2020/5/7 15:43:56
 */
public class FundFacade {
    private StockA stockA;
    private StockB stockB;
    private StockC stockC;
    private RealtyA realtyA;
    private NationnalDebtA nationnalDebtA;

    public FundFacade() {
        stockA = new StockA();
        stockB = new StockB();
        stockC = new StockC();
        realtyA = new RealtyA();
        nationnalDebtA = new NationnalDebtA();
    }

    public void buyFund(){
        System.out.println("买入基金,基金Facade买入真实的投资产品 >>>>>>");
        stockA.buy();
        stockB.buy();
        stockC.buy();
        realtyA.buy();
        nationnalDebtA.buy();
    }


    public void sellFund(){
        System.out.println("卖出基金,基金Facade卖出真实的投资产品 >>>>>>");
        stockA.sell();
        stockB.sell();
        stockC.sell();
        realtyA.sell();
        nationnalDebtA.sell();
    }
}
