package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import com.zx.zxutils.views.MPChart.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
