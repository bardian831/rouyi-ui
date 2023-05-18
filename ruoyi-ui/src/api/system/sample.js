import request from '@/utils/request'

// 查询样品列表
export function listSample(query) {
  return request({
    url: '/system/sample/list',
    method: 'get',
    params: query
  })
}

// 查询样品详细
export function getSample(sampleId) {
  return request({
    url: '/system/sample/' + sampleId,
    method: 'get'
  })
}

// 新增样品
export function addSample(data) {
  return request({
    url: '/system/sample',
    method: 'post',
    data: data
  })
}

// 修改样品
export function updateSample(data) {
  return request({
    url: '/system/sample',
    method: 'put',
    data: data
  })
}

// 删除样品
export function delSample(sampleId) {
  return request({
    url: '/system/sample/' + sampleId,
    method: 'delete'
  })
}
