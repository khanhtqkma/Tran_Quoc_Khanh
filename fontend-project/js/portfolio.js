
$(function () {
    function activeTab(obj)
    {
    
    $('.tab-wrapper ul li').removeClass('active');
  
    $(obj).addClass('active');

    var id = $(obj).find('a').attr('href');
   
    $('.tab-item').hide();

    $(id) .show();
}
$('.tab li').click(function(){
    activeTab(this);
    return false;
});
activeTab($('.tab li:first-child'));
})
// Xóa class active tất cả các tab
// Thêm class active vòa tab đang click
// Lấy href của tab để show content tương ứng
 // Ẩn hết nội dung các tab đang hiển thị
 // Hiển thị nội dung của tab hiện tại