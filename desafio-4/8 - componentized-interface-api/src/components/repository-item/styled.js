import styled from 'styled-components';

export const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  row-gap: 8px;
  padding: 16px;
  height: 150px;
  border: 1px solid #ccc;
  border-radius: 16px;
  font-weight: bold;
`;

export const WrapperTitle = styled.h2`
  font-size: 20px;
`;

export const WrapperFullName = styled.h2`
  font-size: 16px;
  color: #2d3748;
`;

export const WrapperLink = styled.a`
  font-size: 12px;
  overflow-wrap: break-word;
  word-wrap: break-word;
  color: #3182ce;
`;
