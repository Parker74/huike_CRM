package com.huike.report.mapper;

import com.huike.clues.domain.vo.PieChartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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


	/**
	 * 查询今日新增合同数量
	 * @param username
	 * @param today
	 * @return
	 */
	Integer getTodayContracNum(@Param("username") String username, @Param("now()") String today);

	/**
	 * 获取今日新增商机数量
	 * @param username
	 * @param today
	 * @return
	 */
	Integer getTodayBusinessNum(@Param("username") String username, @Param("now()") String today);


	/**
	 * 查询今日合同成交金额
	 * @param username
	 * @param today
	 * @return
	 */
	Double getTodaySalesAmount(@Param("username") String username, @Param("now()") String today);

	/**
	 * 获取待跟进线索数量
	 * @param userName
	 * @param beginCreateTime
	 * @param endCreateTime
	 * @return
	 */
	Integer getfollowedCluesNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);


	/**
	 * 获取待跟进商机数量
	 * @param userName
	 * @param beginCreateTime
	 * @param endCreateTime
	 * @return
	 */
	Integer getfollowedBusinessNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);

	/**
	 * 获取未分配线索数量
	 * @param userName
	 * @param beginCreateTime
	 * @param endCreateTime
	 * @return
	 */
	Integer getToallocatedCluesNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);

	/**
	 * 获取未分配商机数量
	 * @param userName
	 * @param beginCreateTime
	 * @param endCreateTime
	 * @return
	 */
	Integer getToallocatedBusinessNum(@Param("username") String userName,@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime")String endCreateTime);

	/**
	 * 饼状图
	 * @param beginCreateTime
	 * @param endCreateTime
	 * @return
	 */
    List<PieChartVO> subjectStatistics(@Param("beginCreateTime") String beginCreateTime, @Param("endCreateTime") String endCreateTime);
}
