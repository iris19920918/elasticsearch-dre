package com.hikvision.dre.service;

import com.hikvision.dre.dto.doc.request.DeleteDocByIdRequest;
import com.hikvision.dre.dto.doc.request.UpdateDocByIdRequest;
import com.hikvision.dre.dto.doc.request.upload.UploadDocumentRequest;
import com.hikvision.dre.dto.doc.response.DeleteDocByIdResponse;
import com.hikvision.dre.dto.doc.response.UpdateDocByIdResponse;
import com.hikvision.dre.dto.doc.response.upload.UploadDocumentResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangdingding5
 * @Date: 2018/12/13 20:30
 * @Description: 文档增删改服务
 */
public interface DocumentService {

    /**
     * 上传文档数据到ES
     * @param request
     * @return
     */
    @RequestMapping("es/dre/document/uploadDocument")
    UploadDocumentResponse uploadDocument(@RequestBody UploadDocumentRequest request);

    /**
     * 根据ID更新文档信息
     * @param request
     * @return
     */
    @RequestMapping("es/dre/document/updateDocById")
    UpdateDocByIdResponse updateDocById(@RequestBody UpdateDocByIdRequest request);

    /**
     * 根据ID删除某个文档
     * @param request
     * @return
     */
    @RequestMapping("es/dre/document/deleteDocById")
    DeleteDocByIdResponse deleteDocById(@RequestBody DeleteDocByIdRequest request);
}
