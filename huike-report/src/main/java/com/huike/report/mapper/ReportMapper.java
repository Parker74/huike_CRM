package com.huike.report.mapper;

import java.util.Map;

import com.huike.common.core.domain.AjaxResult;
import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 * @author Administrator
 *
 */
public interface ReportMapper {
	/**=========================================基本数据========================================*/
	/**
	 * 获取线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getCluesNum(@Param("startTime") String beginCreateTime,
						@Param("endTime") String endCreateTime,
						@Param("username") String username);

	/**
	 * 获取商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getBusinessNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);

	/**
	 * 获取合同数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getContractNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);

	/**
	 * 获取合同金额
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Double getSalesAmount(@Param("startTime") String beginCreateTime,
						  @Param("endTime") String endCreateTime,
						  @Param("username") String username);

	/**
	 * 获取今日线索数量
	 * @param username
	 * @param today
	 * @return
	 */
	Integer getTodayCluesNum(@Param("username") String username, @Param("now()") String today);



	Integer getfollowedCluesNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);

	Integer getfollowedBusinessNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);


	/**=========================================今日简报========================================*/



	/**=========================================待办========================================*/

}
