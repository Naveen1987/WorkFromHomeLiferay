create table wiki_comment_table (
	comment_ID LONG not null primary key,
	Comment_data VARCHAR(75) null,
	Comment_User VARCHAR(75) null,
	Comment_Date VARCHAR(75) null,
	PageID LONG
);

create table wiki_node_table (
	NodeID LONG not null primary key,
	NodeName VARCHAR(75) null,
	NodeDescription VARCHAR(75) null,
	NodeCreationDate VARCHAR(75) null,
	NodeCreator VARCHAR(75) null,
	NodeModificationDate VARCHAR(75) null
);

create table wiki_page_table (
	PageID LONG not null primary key,
	PageName VARCHAR(75) null,
	PageDescription VARCHAR(75) null,
	PageRating VARCHAR(75) null,
	PageVersion VARCHAR(75) null,
	NodeID LONG,
	Page_Creation_Date VARCHAR(75) null,
	Page_creator VARCHAR(75) null
);

create table wiki_pagedata_table (
	Page_ModID LONG not null primary key,
	PageData VARCHAR(75) null,
	PageEdit_User VARCHAR(75) null,
	Page_editDate VARCHAR(75) null,
	Page_Version VARCHAR(75) null,
	PageID LONG
);