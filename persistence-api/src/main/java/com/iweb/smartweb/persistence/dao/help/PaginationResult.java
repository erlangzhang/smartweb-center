package com.iweb.smartweb.persistence.dao.help;

import com.iweb.smartweb.commons.utils.MapBean;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 类注释
 * <p/>
 * <ul>
 * <li>方法列表</li>
 * </ul>
 *
 * @author zhanglingsi
 * @version 1.0.0 createTime: 16/1/20 09:49
 * @since 1.0
 */
public class PaginationResult<T> {

    //专用标识
    @Getter
    @Setter
    private Integer flag = 1;

    //需要分页的数据
    @Getter
    @Setter
    private List<T> data;

    @Getter
    @Setter
    private MapBean map;

    //当前页码
    @Getter
    @Setter
    private Integer pageNo = 1;

    //每页显示数据的条数
    @Getter
    @Setter
    private Integer pageSize = 10;

    //总记录数
    @Getter
    @Setter
    private Integer total;

    //分页总页数
    @Getter
    @Setter
    private Integer pageCount=0;

    //分页使用实际开始记录数
    @Getter
    private Integer beginNo;

    //分页使用实际结束记录数
    @Getter
    private Integer endNo;

    @Getter
    @Setter
    private long queryTime;

    public PaginationResult(Integer pageNo) {
        this.pageNo = pageNo;
        this.beginNo = pageSize * ( pageNo - 1 ) ;
        this.endNo = pageSize * pageNo ;
    }

    public PaginationResult(Integer pageNo, Integer pageSize) {
        this.pageNo = 1;
        this.pageSize = pageSize;
        this.beginNo = pageSize * ( pageNo - 1 );
        this.endNo = pageSize * pageNo ;
    }

    //首页
    public Integer getStart() {
        return 1;
    }

    //下一页
    public Integer getNext() {
        return this.pageNo < this.pageCount ? pageNo + 1 : this.pageCount;
    }

    //上一页
    public Integer getPrevious() {
        return this.pageNo > 1 ? pageNo - 1 : 1;
    }

    //尾页
    public Integer getEnd() {
        return total;
    }

    //重新设定分页策略
    private void resetPage() {
        if (total == 0 || pageSize == 0){
            return;
        }
        pageCount = ((total % pageSize == 0) ? total / pageSize : (total + pageSize) / pageSize);
        if (pageNo > pageCount) {
            pageNo = pageCount;
        }
    }

}
